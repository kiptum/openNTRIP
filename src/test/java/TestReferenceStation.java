import org.adv25.ADVNTRIP.Clients.Client;
import org.adv25.ADVNTRIP.Databases.Models.MountPointModel;
import org.adv25.ADVNTRIP.Databases.Models.NtripCasterModel;
import org.adv25.ADVNTRIP.Databases.Models.ReferenceStationModel;
import org.adv25.ADVNTRIP.Servers.NtripCaster;
import org.adv25.ADVNTRIP.Servers.ReferenceStation;
import org.adv25.ADVNTRIP.Spatial.PointLla;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TestReferenceStation extends NtripCaster {
    public TestReferenceStation(NtripCasterModel model) throws IOException {
        super(model);
    }

    @Test
    public void getStationFromPool() throws IOException {
        ReferenceStationModel WarszawaStationModel = new ReferenceStationModel();
        WarszawaStationModel.setLla(new PointLla("POINT(52.238056 21.011723)"));
        WarszawaStationModel.setIs_online(true);
        ReferenceStation Warszawa = new ReferenceStation(WarszawaStationModel);

        ReferenceStationModel LisboaStationModel = new ReferenceStationModel();
        LisboaStationModel.setLla(new PointLla("POINT(38.736964 -9.140344)"));
        LisboaStationModel.setIs_online(true);
        ReferenceStation Lisboa = new ReferenceStation(LisboaStationModel);

        MountPointModel mountPointModel = new MountPointModel();
        ArrayList<ReferenceStation> referenceStations = new ArrayList<>();
        referenceStations.add(Warszawa);
        referenceStations.add(Lisboa);

        this.mountPoints.add(mountPointModel);

    }
}
