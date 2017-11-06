package com.example.hp.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class PeriodicTableActivity extends Activity {

    public static int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_periodic_table, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void HClicked(View v)
    {
        index=0;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void HeClicked(View v)
    {
        index=1;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void LiClicked(View v)
    {
        index=2;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void BeClicked(View v)
    {
        index=3;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void BClicked(View v)
    {
        index=4;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void CClicked(View v)
    {
        index=5;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void NClicked(View v)
    {
        index=6;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void OClicked(View v)
    {
        index=7;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void FClicked(View v)
    {
        index=8;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void NeClicked(View v)
    {
        index=9;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void NaClicked(View v)
    {
        index=10;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void MgClicked(View v)
    {
        index=11;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void AlClicked(View v)
    {
        index=12;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SiClicked(View v)
    {
        index=13;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void PClicked(View v)
    {
        index=14;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SClicked(View v)
    {
        index=15;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void ClClicked(View v)
    {
        index=16;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ArClicked(View v)
    {
        index=17;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void KClicked(View v)
    {
        index=18;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void CaClicked(View v)
    {
        index=19;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ScClicked(View v)
    {
        index=20;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void TiClicked(View v)
    {
        index=21;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void VClicked(View v)
    {
        index=22;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void CrClicked(View v)
    {
        index=23;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void MnClicked(View v)
    {
        index=24;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void FeClicked(View v)
    {
        index=25;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void CoClicked(View v)
    {
        index=26;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void NiClicked(View v)
    {
        index=27;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void CuClicked(View v)
    {
        index=28;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ZnClicked(View v)
    {
        index=29;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void GaClicked(View v)
    {
        index=30;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void GeClicked(View v)
    {
        index=31;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void AsClicked(View v)
    {
        index=32;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SeClicked(View v)
    {
        index=33;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void BrClicked(View v)
    {
        index=34;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void KrClicked(View v)
    {
        index=35;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RbClicked(View v)
    {
        index=36;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SrClicked(View v)
    {
        index=37;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void YClicked(View v)
    {
        index=38;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ZrClicked(View v)
    {
        index=39;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void NbClicked(View v)
    {
        index=40;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void MoClicked(View v)
    {
        index=41;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void TcClicked(View v)
    {
        index=42;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RuClicked(View v)
    {
        index=43;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RhClicked(View v)
    {
        index=44;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void PdClicked(View v)
    {
        index=45;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void AgClicked(View v)
    {
        index=46;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void CdClicked(View v)
    {
        index=47;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void InClicked(View v)
    {
        index=48;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SnClicked(View v)
    {
        index=49;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void SbClicked(View v)
    {
        index=50;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void TeClicked(View v)
    {
        index=51;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void IClicked(View v)
    {
        index=52;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void XeClicked(View v)
    {
        index=53;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void CsClicked(View v)
    {
        index=54;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void BaClicked(View v)
    {
        index=55;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void LaClicked(View v)
    {
        index=56;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void HfClicked(View v)
    {
        index=71;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void TaClicked(View v)
    {
        index=72;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void WClicked(View v)
    {
        index=73;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ReClicked(View v)
    {
        index=74;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void OsClicked(View v)
    {
        index=75;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void IrClicked(View v)
    {
        index=76;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void PtClicked(View v)
    {
        index=77;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void AuClicked(View v)
    {
        index=78;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void HgClicked(View v)
    {
        index=79;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void TlClicked(View v)
    {
        index=80;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void PbClicked(View v)
    {
        index=81;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void BiClicked(View v)
    {
        index=82;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void PoClicked(View v)
    {
        index=83;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void AtClicked(View v)
    {
        index=84;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RnClicked(View v)
    {
        index=85;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void FrClicked(View v)
    {
        index=86;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RaClicked(View v)
    {
        index=87;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void AcClicked(View v)
    {
        index=88;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void RfClicked(View v)
    {
        index=103;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void DbClicked(View v)
    {
        index=104;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void SgClicked(View v)
    {
        index=105;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void BhClicked(View v)
    {
        index=106;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void MtClicked(View v)
    {
        index=108;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }

    public void CeClicked(View v)
    {
        index=57;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void HsClicked(View v)
    {
        index=107;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void PrClicked(View v)
    {
        index=58;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void NdClicked(View v)
    {
        index=59;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void PmClicked(View v)
    {
        index=60;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void SmClicked(View v)
    {
        index=61;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void EuClicked(View v)
    {
        index=62;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void GdClicked(View v)
    {
        index=63;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void TbClicked(View v)
    {
        index=64;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void DyClicked(View v)
    {
        index=65;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void HoClicked(View v)
    {
        index=66;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void ErClicked(View v)
    {
        index=67;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void TmClicked(View v)
    {
        index=68;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void YbClicked(View v)
    {
        index=69;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void LuClicked(View v)
    {
        index=70;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void ThClicked(View v)
    {
        index=89;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void PaClicked(View v)
    {
        index=90;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void UClicked(View v)
    {
        index=91;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void NpClicked(View v)
    {
        index=92;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void PuClicked(View v)
    {
        index=93;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void AmClicked(View v)
    {
        index=94;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void CmClicked(View v)
    {
        index=95;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void BkClicked(View v)
    {
        index=96;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void CfClicked(View v)
    {
        index=97;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void EsClicked(View v)
    {
        index=98;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void FmClicked(View v)
    {
        index=99;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void MdClicked(View v)
    {
        index=100;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void NoClicked(View v)
    {
        index=101;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }public void LrClicked(View v)
    {
        index=102;
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
}
