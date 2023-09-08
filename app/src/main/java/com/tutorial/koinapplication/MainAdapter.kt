package com.tutorial.koinapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.tutorial.koinapplication.data.model.User

/**
 * Created by Chandan Jana on 01-09-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var textViewUserName: TextView = itemView.findViewById(R.id.textViewUserName)
        private var textViewUserEmail: TextView = itemView.findViewById(R.id.textViewUserEmail)
        private var imageViewAvatar: ImageView = itemView.findViewById(R.id.imageViewAvatar)
        fun bind(user: User) {
            textViewUserName.text = user.name
            textViewUserEmail.text = user.email
            imageViewAvatar.load(user.avatar) {
                crossfade(true)
                placeholder(R.drawable.ic_launcher_background)
                transformations(RoundedCornersTransformation(radius = 20f))
            }
            /*Glide.with(imageViewAvatar.context)
                .load(user.avatar)
                .into(imageViewAvatar)*/
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}