package com.example.yankees

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "SquadListFragment"

class SquadListFragment : Fragment() {

    private lateinit var playerRecyclerView : RecyclerView
    private var adapter: PlayerAdapter? = null

    private val squadListViewModel: SquadListViewModel by lazy{
        ViewModelProviders.of(this).get(SquadListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        squadListViewModel.players.add(
            Squad(img = "https://content.mlb.com/images/headshots/current/60x60/570666@3x.png",
                name = "Luis Cessa",
                height= "183 cm",
                weight= "94.3472 kg",
                shirtNum= 85,
                age= 28)
        )
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/547973@3x.png",
            name = "Aroldis Chapman",
            height= "193 cm",
            weight= "98.8831 kg",
            shirtNum= 54,
            age= 33))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/543037@3x.png",
            name = "Gerrit Cole",
            height= "193 cm",
            weight= "100 kg",
            shirtNum= 45,
            age= 30))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/593334@3x.png",
            name = "Domingo Germán",
            height= "188 cm",
            weight= "82 kg",
            shirtNum= 55,
            age= 28))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/643338@3x.png",
            name = "Chad Green",
            height= "190 cm",
            weight= "97.5 kg",
            shirtNum= 57,
            age= 29))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/446372@3x.png",
            name = "Corey Kluber",
            height= "193 cm",
            weight= "97.5 kg",
            shirtNum= 28,
            age= 34))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/642528@3x.png",
            name = "Jonathan Loaisiga",
            height= "180 cm",
            weight= "75 kg",
            shirtNum= 43,
            age= 26))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/476595@3x.png",
            name = "Lucas Luetge",
            height= "193 cm",
            weight= "92 kg",
            shirtNum= 63,
            age= 34))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/656756@3x.png",
            name = "Jordan Montgomery",
            height= "198 cm",
            weight= "103 kg",
            shirtNum= 47,
            age= 28))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/656793@3x.png",
            name = "Nick Nelson",
            height= "185 cm",
            weight= "93 kg",
            shirtNum= 79,
            age= 25))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/503285@3x.png",
            name = "Darren O'Day",
            height= "193 cm",
            weight= "100 kg",
            shirtNum= 56,
            age= 38))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/592791@3x.png",
            name = "Jameson Taillon",
            height= "195 cm",
            weight= "104 kg",
            shirtNum= 50,
            age= 0))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/543309@3x.png",
            name = "Kyle Higashioka",
            height= "185 cm",
            weight= "100 kg",
            shirtNum= 66,
            age= 30))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/596142@3x.png",
            name = "Gary Sánchez",
            height= "188 cm",
            weight= "104 kg",
            shirtNum= 24,
            age= 28))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/518934@3x.png",
            name = "DJ LeMahieu",
            height= "193 cm",
            weight= "100 kg",
            shirtNum= 26,
            age= 32))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/650402@3x.png",
            name = "Gleyber Torres",
            height= "185 cm",
            weight= "92 kg",
            shirtNum= 25,
            age= 24))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/570482@3x.png",
            name = "Gio Urshela",
            height= "183 cm",
            weight= "97.5 kg",
            shirtNum= 29,
            age= 29))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/642180@3x.png",
            name = "Tyler Wade",
            height= "185 cm",
            weight= "85 kg",
            shirtNum= 14,
            age= 26))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/457803@3x.png",
            name = "Jay Bruce",
            height= "190 cm",
            weight= "104 kg",
            shirtNum= 30,
            age= 34))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/640449@3x.png",
            name = "Clint Frazier",
            height= "180 cm",
            weight= "96 kg",
            shirtNum= 77,
            age= 26))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/458731@3x.png",
            name = "Brett Gardner",
            height= "180 cm",
            weight= "88 kg",
            shirtNum= 11,
            age= 37))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/543305@3x.png",
            name = "Aaron Hicks",
            height= "185 cm",
            weight= "93 kg",
            shirtNum= 31,
            age= 31))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/592450@3x.png",
            name = "Aaron Judge",
            height= "200 cm",
            weight= "128 kg",
            shirtNum= 99,
            age= 28))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/519317@3x.png",
            name = "Giancarlo Stanton",
            height= "198 cm",
            weight= "111 kg",
            shirtNum= 27,
            age= 30))
        squadListViewModel.players.add(Squad(img = "https://content.mlb.com/images/headshots/current/60x60/643565@3x.png",
            name = "Mike Tauchman",
            height= "188 cm",
            weight= "99 kg",
            shirtNum= 39,
            age= 30)
        )

        Log.d(TAG,"Total players: ${squadListViewModel.players.size}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_players_list, container, false)

        playerRecyclerView = view.findViewById(R.id.player_recycler_view) as RecyclerView
        playerRecyclerView.layoutManager = LinearLayoutManager(context)

        updateUI()

        return view
    }

    private fun updateUI(){
        val players = squadListViewModel.players
        adapter = PlayerAdapter(players)
        playerRecyclerView.adapter = adapter
    }

    private inner class PlayerHolder(view: View)
        : RecyclerView.ViewHolder(view), View.OnClickListener {
        private lateinit var player: Squad

        private val nameTextView : TextView = itemView.findViewById(R.id.player_name)
        private val ageTextView : TextView = itemView.findViewById(R.id.player_age)
        private val heightTextView : TextView = itemView.findViewById(R.id.player_height)
        private val weightTextView : TextView = itemView.findViewById(R.id.player_weight)
        private val shirtNoTextView : TextView = itemView.findViewById(R.id.player_shirtNo)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(player: Squad){
            this.player = player

            nameTextView.text = this.player.name
            ageTextView.text = this.player.age.toString()
            heightTextView.text = this.player.height
            weightTextView.text = this.player.weight
            shirtNoTextView.text = this.player.shirtNum.toString()
        }

        override fun onClick(v: View?) {
            Toast.makeText(context, "${player.name} pressed!", Toast.LENGTH_SHORT)
                .show()
        }

    }

    private inner class PlayerAdapter(var players: List<Squad>)
        :RecyclerView.Adapter<PlayerHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
            val view = layoutInflater.inflate(R.layout.list_item_player, parent, false)
            return PlayerHolder(view)
        }

        override fun getItemCount() = players.size


        override fun onBindViewHolder(holder: PlayerHolder, position: Int) {
            val player = players[position]
            holder.bind(player)
        }
    }

    companion object{
        fun newInstance(): SquadListFragment{
            return SquadListFragment()
        }
    }

}
