import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class TrainScheduleWidget extends AppWidgetProvider {

    // Ülekirjuta onUpdate meetod, mis vastutab vidina värskendamise eest
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // Käi läbi kõik vidina eksemplarid (kui on mitu sama vidinat ekraanil)
        for (int appWidgetId : appWidgetIds) {
            // Loome RemoteViews objekti, mis seob layout'iga
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);

            // Siin seadistame näidisandmed
            views.setTextViewText(R.id.stationName, "Elron Tondi");
            views.setTextViewText(R.id.departureTime1, "09:41");
            views.setTextViewText(R.id.stationName2, "Kivimäe");
            views.setTextViewText(R.id.departureTime2, "09:50");
            views.setTextViewText(R.id.stationName3, "Kivimäe");
            views.setTextViewText(R.id.departureTime3, "10:00");

            // Uuenda vidinat ekraanil
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
