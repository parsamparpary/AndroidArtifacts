package android.support.v7.widget.util;

import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;

public abstract class SortedListAdapterCallback extends SortedList.Callback {
   final RecyclerView.Adapter mAdapter;

   public SortedListAdapterCallback(RecyclerView.Adapter adapter) {
      this.mAdapter = adapter;
   }

   public void onInserted(int position, int count) {
      this.mAdapter.notifyItemRangeInserted(position, count);
   }

   public void onRemoved(int position, int count) {
      this.mAdapter.notifyItemRangeRemoved(position, count);
   }

   public void onMoved(int fromPosition, int toPosition) {
      this.mAdapter.notifyItemMoved(fromPosition, toPosition);
   }

   public void onChanged(int position, int count) {
      this.mAdapter.notifyItemRangeChanged(position, count);
   }
}
