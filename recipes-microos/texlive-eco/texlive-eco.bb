SUMMARY = "Oldstyle numerals using EC fonts"
DESCRIPTION = "A set of font metric files and virtual fonts for using the EC \
fonts with oldstyle numerals. These files can only be used \
together with the standard ec fonts. The style file eco.sty is \
sufficient to use the eco fonts but if you intend to use other \
font families as well, e.g., PostScript fonts, try altfont."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn29349"

RPM_NAME = "texlive-eco-2023.201.1.3svn29349-53.1.noarch.rpm"
RPM_HASH = "df0eb356a6bc8e05c771045cac7c51878f03004576f8ba199ed2935bd121734c76a5d4a79b840f98653f00f108a7600470efe5f33df8cb6e15a3466a7b03724d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(T1cmodh.fd) \
tex(T1cmor.fd) \
tex(T1cmoss.fd) \
tex(T1cmott.fd) \
tex(T1cmovt.fd) \
tex(eco.sty) \
tex(ecobi0500.tfm) \
tex(ecobi0500.vf) \
tex(ecobi0600.tfm) \
tex(ecobi0600.vf) \
tex(ecobi0700.tfm) \
tex(ecobi0700.vf) \
tex(ecobi0800.tfm) \
tex(ecobi0800.vf) \
tex(ecobi0900.tfm) \
tex(ecobi0900.vf) \
tex(ecobi1000.tfm) \
tex(ecobi1000.vf) \
tex(ecobi1095.tfm) \
tex(ecobi1095.vf) \
tex(ecobi1200.tfm) \
tex(ecobi1200.vf) \
tex(ecobi1440.tfm) \
tex(ecobi1440.vf) \
tex(ecobi1728.tfm) \
tex(ecobi1728.vf) \
tex(ecobi2074.tfm) \
tex(ecobi2074.vf) \
tex(ecobi2488.tfm) \
tex(ecobi2488.vf) \
tex(ecobi2986.tfm) \
tex(ecobi2986.vf) \
tex(ecobi3583.tfm) \
tex(ecobi3583.vf) \
tex(ecobl0500.tfm) \
tex(ecobl0500.vf) \
tex(ecobl0600.tfm) \
tex(ecobl0600.vf) \
tex(ecobl0700.tfm) \
tex(ecobl0700.vf) \
tex(ecobl0800.tfm) \
tex(ecobl0800.vf) \
tex(ecobl0900.tfm) \
tex(ecobl0900.vf) \
tex(ecobl1000.tfm) \
tex(ecobl1000.vf) \
tex(ecobl1095.tfm) \
tex(ecobl1095.vf) \
tex(ecobl1200.tfm) \
tex(ecobl1200.vf) \
tex(ecobl1440.tfm) \
tex(ecobl1440.vf) \
tex(ecobl1728.tfm) \
tex(ecobl1728.vf) \
tex(ecobl2074.tfm) \
tex(ecobl2074.vf) \
tex(ecobl2488.tfm) \
tex(ecobl2488.vf) \
tex(ecobl2986.tfm) \
tex(ecobl2986.vf) \
tex(ecobl3583.tfm) \
tex(ecobl3583.vf) \
tex(ecobx0500.tfm) \
tex(ecobx0500.vf) \
tex(ecobx0600.tfm) \
tex(ecobx0600.vf) \
tex(ecobx0700.tfm) \
tex(ecobx0700.vf) \
tex(ecobx0800.tfm) \
tex(ecobx0800.vf) \
tex(ecobx0900.tfm) \
tex(ecobx0900.vf) \
tex(ecobx1000.tfm) \
tex(ecobx1000.vf) \
tex(ecobx1095.tfm) \
tex(ecobx1095.vf) \
tex(ecobx1200.tfm) \
tex(ecobx1200.vf) \
tex(ecobx1440.tfm) \
tex(ecobx1440.vf) \
tex(ecobx1728.tfm) \
tex(ecobx1728.vf) \
tex(ecobx2074.tfm) \
tex(ecobx2074.vf) \
tex(ecobx2488.tfm) \
tex(ecobx2488.vf) \
tex(ecobx2986.tfm) \
tex(ecobx2986.vf) \
tex(ecobx3583.tfm) \
tex(ecobx3583.vf) \
tex(ecodh0500.tfm) \
tex(ecodh0500.vf) \
tex(ecodh0600.tfm) \
tex(ecodh0600.vf) \
tex(ecodh0700.tfm) \
tex(ecodh0700.vf) \
tex(ecodh0800.tfm) \
tex(ecodh0800.vf) \
tex(ecodh0900.tfm) \
tex(ecodh0900.vf) \
tex(ecodh1000.tfm) \
tex(ecodh1000.vf) \
tex(ecodh1095.tfm) \
tex(ecodh1095.vf) \
tex(ecodh1200.tfm) \
tex(ecodh1200.vf) \
tex(ecodh1440.tfm) \
tex(ecodh1440.vf) \
tex(ecodh1728.tfm) \
tex(ecodh1728.vf) \
tex(ecodh2074.tfm) \
tex(ecodh2074.vf) \
tex(ecodh2488.tfm) \
tex(ecodh2488.vf) \
tex(ecodh2986.tfm) \
tex(ecodh2986.vf) \
tex(ecodh3583.tfm) \
tex(ecodh3583.vf) \
tex(ecoit0600.tfm) \
tex(ecoit0600.vf) \
tex(ecoit0700.tfm) \
tex(ecoit0700.vf) \
tex(ecoit0800.tfm) \
tex(ecoit0800.vf) \
tex(ecoit0900.tfm) \
tex(ecoit0900.vf) \
tex(ecoit1000.tfm) \
tex(ecoit1000.vf) \
tex(ecoit1095.tfm) \
tex(ecoit1095.vf) \
tex(ecoit1200.tfm) \
tex(ecoit1200.vf) \
tex(ecoit1440.tfm) \
tex(ecoit1440.vf) \
tex(ecoit1728.tfm) \
tex(ecoit1728.vf) \
tex(ecoit2074.tfm) \
tex(ecoit2074.vf) \
tex(ecoit2488.tfm) \
tex(ecoit2488.vf) \
tex(ecoit2986.tfm) \
tex(ecoit2986.vf) \
tex(ecoit3583.tfm) \
tex(ecoit3583.vf) \
tex(ecorb0500.tfm) \
tex(ecorb0500.vf) \
tex(ecorb0600.tfm) \
tex(ecorb0600.vf) \
tex(ecorb0700.tfm) \
tex(ecorb0700.vf) \
tex(ecorb0800.tfm) \
tex(ecorb0800.vf) \
tex(ecorb0900.tfm) \
tex(ecorb0900.vf) \
tex(ecorb1000.tfm) \
tex(ecorb1000.vf) \
tex(ecorb1095.tfm) \
tex(ecorb1095.vf) \
tex(ecorb1200.tfm) \
tex(ecorb1200.vf) \
tex(ecorb1440.tfm) \
tex(ecorb1440.vf) \
tex(ecorb1728.tfm) \
tex(ecorb1728.vf) \
tex(ecorb2074.tfm) \
tex(ecorb2074.vf) \
tex(ecorb2488.tfm) \
tex(ecorb2488.vf) \
tex(ecorb2986.tfm) \
tex(ecorb2986.vf) \
tex(ecorb3583.tfm) \
tex(ecorb3583.vf) \
tex(ecorm0500.tfm) \
tex(ecorm0500.vf) \
tex(ecorm0600.tfm) \
tex(ecorm0600.vf) \
tex(ecorm0700.tfm) \
tex(ecorm0700.vf) \
tex(ecorm0800.tfm) \
tex(ecorm0800.vf) \
tex(ecorm0900.tfm) \
tex(ecorm0900.vf) \
tex(ecorm1000.tfm) \
tex(ecorm1000.vf) \
tex(ecorm1095.tfm) \
tex(ecorm1095.vf) \
tex(ecorm1200.tfm) \
tex(ecorm1200.vf) \
tex(ecorm1440.tfm) \
tex(ecorm1440.vf) \
tex(ecorm1728.tfm) \
tex(ecorm1728.vf) \
tex(ecorm2074.tfm) \
tex(ecorm2074.vf) \
tex(ecorm2488.tfm) \
tex(ecorm2488.vf) \
tex(ecorm2986.tfm) \
tex(ecorm2986.vf) \
tex(ecorm3583.tfm) \
tex(ecorm3583.vf) \
tex(ecosi0500.tfm) \
tex(ecosi0500.vf) \
tex(ecosi0600.tfm) \
tex(ecosi0600.vf) \
tex(ecosi0700.tfm) \
tex(ecosi0700.vf) \
tex(ecosi0800.tfm) \
tex(ecosi0800.vf) \
tex(ecosi0900.tfm) \
tex(ecosi0900.vf) \
tex(ecosi1000.tfm) \
tex(ecosi1000.vf) \
tex(ecosi1095.tfm) \
tex(ecosi1095.vf) \
tex(ecosi1200.tfm) \
tex(ecosi1200.vf) \
tex(ecosi1440.tfm) \
tex(ecosi1440.vf) \
tex(ecosi1728.tfm) \
tex(ecosi1728.vf) \
tex(ecosi2074.tfm) \
tex(ecosi2074.vf) \
tex(ecosi2488.tfm) \
tex(ecosi2488.vf) \
tex(ecosi2986.tfm) \
tex(ecosi2986.vf) \
tex(ecosi3583.tfm) \
tex(ecosi3583.vf) \
tex(ecosl0500.tfm) \
tex(ecosl0500.vf) \
tex(ecosl0600.tfm) \
tex(ecosl0600.vf) \
tex(ecosl0700.tfm) \
tex(ecosl0700.vf) \
tex(ecosl0800.tfm) \
tex(ecosl0800.vf) \
tex(ecosl0900.tfm) \
tex(ecosl0900.vf) \
tex(ecosl1000.tfm) \
tex(ecosl1000.vf) \
tex(ecosl1095.tfm) \
tex(ecosl1095.vf) \
tex(ecosl1200.tfm) \
tex(ecosl1200.vf) \
tex(ecosl1440.tfm) \
tex(ecosl1440.vf) \
tex(ecosl1728.tfm) \
tex(ecosl1728.vf) \
tex(ecosl2074.tfm) \
tex(ecosl2074.vf) \
tex(ecosl2488.tfm) \
tex(ecosl2488.vf) \
tex(ecosl2986.tfm) \
tex(ecosl2986.vf) \
tex(ecosl3583.tfm) \
tex(ecosl3583.vf) \
tex(ecoso0500.tfm) \
tex(ecoso0500.vf) \
tex(ecoso0600.tfm) \
tex(ecoso0600.vf) \
tex(ecoso0700.tfm) \
tex(ecoso0700.vf) \
tex(ecoso0800.tfm) \
tex(ecoso0800.vf) \
tex(ecoso0900.tfm) \
tex(ecoso0900.vf) \
tex(ecoso1000.tfm) \
tex(ecoso1000.vf) \
tex(ecoso1095.tfm) \
tex(ecoso1095.vf) \
tex(ecoso1200.tfm) \
tex(ecoso1200.vf) \
tex(ecoso1440.tfm) \
tex(ecoso1440.vf) \
tex(ecoso1728.tfm) \
tex(ecoso1728.vf) \
tex(ecoso2074.tfm) \
tex(ecoso2074.vf) \
tex(ecoso2488.tfm) \
tex(ecoso2488.vf) \
tex(ecoso2986.tfm) \
tex(ecoso2986.vf) \
tex(ecoso3583.tfm) \
tex(ecoso3583.vf) \
tex(ecoss0500.tfm) \
tex(ecoss0500.vf) \
tex(ecoss0600.tfm) \
tex(ecoss0600.vf) \
tex(ecoss0700.tfm) \
tex(ecoss0700.vf) \
tex(ecoss0800.tfm) \
tex(ecoss0800.vf) \
tex(ecoss0900.tfm) \
tex(ecoss0900.vf) \
tex(ecoss1000.tfm) \
tex(ecoss1000.vf) \
tex(ecoss1095.tfm) \
tex(ecoss1095.vf) \
tex(ecoss1200.tfm) \
tex(ecoss1200.vf) \
tex(ecoss1440.tfm) \
tex(ecoss1440.vf) \
tex(ecoss1728.tfm) \
tex(ecoss1728.vf) \
tex(ecoss2074.tfm) \
tex(ecoss2074.vf) \
tex(ecoss2488.tfm) \
tex(ecoss2488.vf) \
tex(ecoss2986.tfm) \
tex(ecoss2986.vf) \
tex(ecoss3583.tfm) \
tex(ecoss3583.vf) \
tex(ecost0600.tfm) \
tex(ecost0600.vf) \
tex(ecost0700.tfm) \
tex(ecost0700.vf) \
tex(ecost0800.tfm) \
tex(ecost0800.vf) \
tex(ecost0900.tfm) \
tex(ecost0900.vf) \
tex(ecost1000.tfm) \
tex(ecost1000.vf) \
tex(ecost1095.tfm) \
tex(ecost1095.vf) \
tex(ecost1200.tfm) \
tex(ecost1200.vf) \
tex(ecost1440.tfm) \
tex(ecost1440.vf) \
tex(ecost1728.tfm) \
tex(ecost1728.vf) \
tex(ecost2074.tfm) \
tex(ecost2074.vf) \
tex(ecost2488.tfm) \
tex(ecost2488.vf) \
tex(ecost2986.tfm) \
tex(ecost2986.vf) \
tex(ecost3583.tfm) \
tex(ecost3583.vf) \
tex(ecosx0500.tfm) \
tex(ecosx0500.vf) \
tex(ecosx0600.tfm) \
tex(ecosx0600.vf) \
tex(ecosx0700.tfm) \
tex(ecosx0700.vf) \
tex(ecosx0800.tfm) \
tex(ecosx0800.vf) \
tex(ecosx0900.tfm) \
tex(ecosx0900.vf) \
tex(ecosx1000.tfm) \
tex(ecosx1000.vf) \
tex(ecosx1095.tfm) \
tex(ecosx1095.vf) \
tex(ecosx1200.tfm) \
tex(ecosx1200.vf) \
tex(ecosx1440.tfm) \
tex(ecosx1440.vf) \
tex(ecosx1728.tfm) \
tex(ecosx1728.vf) \
tex(ecosx2074.tfm) \
tex(ecosx2074.vf) \
tex(ecosx2488.tfm) \
tex(ecosx2488.vf) \
tex(ecosx2986.tfm) \
tex(ecosx2986.vf) \
tex(ecosx3583.tfm) \
tex(ecosx3583.vf) \
tex(ecoti0500.tfm) \
tex(ecoti0500.vf) \
tex(ecoti0600.tfm) \
tex(ecoti0600.vf) \
tex(ecoti0700.tfm) \
tex(ecoti0700.vf) \
tex(ecoti0800.tfm) \
tex(ecoti0800.vf) \
tex(ecoti0900.tfm) \
tex(ecoti0900.vf) \
tex(ecoti1000.tfm) \
tex(ecoti1000.vf) \
tex(ecoti1095.tfm) \
tex(ecoti1095.vf) \
tex(ecoti1200.tfm) \
tex(ecoti1200.vf) \
tex(ecoti1440.tfm) \
tex(ecoti1440.vf) \
tex(ecoti1728.tfm) \
tex(ecoti1728.vf) \
tex(ecoti2074.tfm) \
tex(ecoti2074.vf) \
tex(ecoti2488.tfm) \
tex(ecoti2488.vf) \
tex(ecoti2986.tfm) \
tex(ecoti2986.vf) \
tex(ecoti3583.tfm) \
tex(ecoti3583.vf) \
tex(ecott0600.tfm) \
tex(ecott0600.vf) \
tex(ecott0700.tfm) \
tex(ecott0700.vf) \
tex(ecott0800.tfm) \
tex(ecott0800.vf) \
tex(ecott0900.tfm) \
tex(ecott0900.vf) \
tex(ecott1000.tfm) \
tex(ecott1000.vf) \
tex(ecott1095.tfm) \
tex(ecott1095.vf) \
tex(ecott1200.tfm) \
tex(ecott1200.vf) \
tex(ecott1440.tfm) \
tex(ecott1440.vf) \
tex(ecott1728.tfm) \
tex(ecott1728.vf) \
tex(ecott2074.tfm) \
tex(ecott2074.vf) \
tex(ecott2488.tfm) \
tex(ecott2488.vf) \
tex(ecott2986.tfm) \
tex(ecott2986.vf) \
tex(ecott3583.tfm) \
tex(ecott3583.vf) \
tex(ecoui0500.tfm) \
tex(ecoui0500.vf) \
tex(ecoui0600.tfm) \
tex(ecoui0600.vf) \
tex(ecoui0700.tfm) \
tex(ecoui0700.vf) \
tex(ecoui0800.tfm) \
tex(ecoui0800.vf) \
tex(ecoui0900.tfm) \
tex(ecoui0900.vf) \
tex(ecoui1000.tfm) \
tex(ecoui1000.vf) \
tex(ecoui1095.tfm) \
tex(ecoui1095.vf) \
tex(ecoui1200.tfm) \
tex(ecoui1200.vf) \
tex(ecoui1440.tfm) \
tex(ecoui1440.vf) \
tex(ecoui1728.tfm) \
tex(ecoui1728.vf) \
tex(ecoui2074.tfm) \
tex(ecoui2074.vf) \
tex(ecoui2488.tfm) \
tex(ecoui2488.vf) \
tex(ecoui2986.tfm) \
tex(ecoui2986.vf) \
tex(ecoui3583.tfm) \
tex(ecoui3583.vf) \
tex(ecovi0600.tfm) \
tex(ecovi0600.vf) \
tex(ecovi0700.tfm) \
tex(ecovi0700.vf) \
tex(ecovi0800.tfm) \
tex(ecovi0800.vf) \
tex(ecovi0900.tfm) \
tex(ecovi0900.vf) \
tex(ecovi1000.tfm) \
tex(ecovi1000.vf) \
tex(ecovi1095.tfm) \
tex(ecovi1095.vf) \
tex(ecovi1200.tfm) \
tex(ecovi1200.vf) \
tex(ecovi1440.tfm) \
tex(ecovi1440.vf) \
tex(ecovi1728.tfm) \
tex(ecovi1728.vf) \
tex(ecovi2074.tfm) \
tex(ecovi2074.vf) \
tex(ecovi2488.tfm) \
tex(ecovi2488.vf) \
tex(ecovi2986.tfm) \
tex(ecovi2986.vf) \
tex(ecovi3583.tfm) \
tex(ecovi3583.vf) \
tex(ecovt0600.tfm) \
tex(ecovt0600.vf) \
tex(ecovt0700.tfm) \
tex(ecovt0700.vf) \
tex(ecovt0800.tfm) \
tex(ecovt0800.vf) \
tex(ecovt0900.tfm) \
tex(ecovt0900.vf) \
tex(ecovt1000.tfm) \
tex(ecovt1000.vf) \
tex(ecovt1095.tfm) \
tex(ecovt1095.vf) \
tex(ecovt1200.tfm) \
tex(ecovt1200.vf) \
tex(ecovt1440.tfm) \
tex(ecovt1440.vf) \
tex(ecovt1728.tfm) \
tex(ecovt1728.vf) \
tex(ecovt2074.tfm) \
tex(ecovt2074.vf) \
tex(ecovt2488.tfm) \
tex(ecovt2488.vf) \
tex(ecovt2986.tfm) \
tex(ecovt2986.vf) \
tex(ecovt3583.tfm) \
tex(ecovt3583.vf) \
texlive-eco"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ecbi0500.tfm) \
tex(ecbi0600.tfm) \
tex(ecbi0700.tfm) \
tex(ecbi0800.tfm) \
tex(ecbi0900.tfm) \
tex(ecbi1000.tfm) \
tex(ecbi1095.tfm) \
tex(ecbi1200.tfm) \
tex(ecbi1440.tfm) \
tex(ecbi1728.tfm) \
tex(ecbi2074.tfm) \
tex(ecbi2488.tfm) \
tex(ecbi2986.tfm) \
tex(ecbi3583.tfm) \
tex(ecbl0500.tfm) \
tex(ecbl0600.tfm) \
tex(ecbl0700.tfm) \
tex(ecbl0800.tfm) \
tex(ecbl0900.tfm) \
tex(ecbl1000.tfm) \
tex(ecbl1095.tfm) \
tex(ecbl1200.tfm) \
tex(ecbl1440.tfm) \
tex(ecbl1728.tfm) \
tex(ecbl2074.tfm) \
tex(ecbl2488.tfm) \
tex(ecbl2986.tfm) \
tex(ecbl3583.tfm) \
tex(ecbx0500.tfm) \
tex(ecbx0600.tfm) \
tex(ecbx0700.tfm) \
tex(ecbx0800.tfm) \
tex(ecbx0900.tfm) \
tex(ecbx1000.tfm) \
tex(ecbx1095.tfm) \
tex(ecbx1200.tfm) \
tex(ecbx1440.tfm) \
tex(ecbx1728.tfm) \
tex(ecbx2074.tfm) \
tex(ecbx2488.tfm) \
tex(ecbx2986.tfm) \
tex(ecbx3583.tfm) \
tex(ecdh0500.tfm) \
tex(ecdh0600.tfm) \
tex(ecdh0700.tfm) \
tex(ecdh0800.tfm) \
tex(ecdh0900.tfm) \
tex(ecdh1000.tfm) \
tex(ecdh1095.tfm) \
tex(ecdh1200.tfm) \
tex(ecdh1440.tfm) \
tex(ecdh1728.tfm) \
tex(ecdh2074.tfm) \
tex(ecdh2488.tfm) \
tex(ecdh2986.tfm) \
tex(ecdh3583.tfm) \
tex(ecit0800.tfm) \
tex(ecit0900.tfm) \
tex(ecit1000.tfm) \
tex(ecit1095.tfm) \
tex(ecit1200.tfm) \
tex(ecit1440.tfm) \
tex(ecit1728.tfm) \
tex(ecit2074.tfm) \
tex(ecit2488.tfm) \
tex(ecit2986.tfm) \
tex(ecit3583.tfm) \
tex(ecrb0500.tfm) \
tex(ecrb0600.tfm) \
tex(ecrb0700.tfm) \
tex(ecrb0800.tfm) \
tex(ecrb0900.tfm) \
tex(ecrb1000.tfm) \
tex(ecrb1095.tfm) \
tex(ecrb1200.tfm) \
tex(ecrb1440.tfm) \
tex(ecrb1728.tfm) \
tex(ecrb2074.tfm) \
tex(ecrb2488.tfm) \
tex(ecrb2986.tfm) \
tex(ecrb3583.tfm) \
tex(ecrm0500.tfm) \
tex(ecrm0600.tfm) \
tex(ecrm0700.tfm) \
tex(ecrm0800.tfm) \
tex(ecrm0900.tfm) \
tex(ecrm1000.tfm) \
tex(ecrm1095.tfm) \
tex(ecrm1200.tfm) \
tex(ecrm1440.tfm) \
tex(ecrm1728.tfm) \
tex(ecrm2074.tfm) \
tex(ecrm2488.tfm) \
tex(ecrm2986.tfm) \
tex(ecrm3583.tfm) \
tex(ecsi0500.tfm) \
tex(ecsi0600.tfm) \
tex(ecsi0700.tfm) \
tex(ecsi0800.tfm) \
tex(ecsi0900.tfm) \
tex(ecsi1000.tfm) \
tex(ecsi1095.tfm) \
tex(ecsi1200.tfm) \
tex(ecsi1440.tfm) \
tex(ecsi1728.tfm) \
tex(ecsi2074.tfm) \
tex(ecsi2488.tfm) \
tex(ecsi2986.tfm) \
tex(ecsi3583.tfm) \
tex(ecsl0500.tfm) \
tex(ecsl0600.tfm) \
tex(ecsl0700.tfm) \
tex(ecsl0800.tfm) \
tex(ecsl0900.tfm) \
tex(ecsl1000.tfm) \
tex(ecsl1095.tfm) \
tex(ecsl1200.tfm) \
tex(ecsl1440.tfm) \
tex(ecsl1728.tfm) \
tex(ecsl2074.tfm) \
tex(ecsl2488.tfm) \
tex(ecsl2986.tfm) \
tex(ecsl3583.tfm) \
tex(ecso0500.tfm) \
tex(ecso0600.tfm) \
tex(ecso0700.tfm) \
tex(ecso0800.tfm) \
tex(ecso0900.tfm) \
tex(ecso1000.tfm) \
tex(ecso1095.tfm) \
tex(ecso1200.tfm) \
tex(ecso1440.tfm) \
tex(ecso1728.tfm) \
tex(ecso2074.tfm) \
tex(ecso2488.tfm) \
tex(ecso2986.tfm) \
tex(ecso3583.tfm) \
tex(ecss0500.tfm) \
tex(ecss0600.tfm) \
tex(ecss0700.tfm) \
tex(ecss0800.tfm) \
tex(ecss0900.tfm) \
tex(ecss1000.tfm) \
tex(ecss1095.tfm) \
tex(ecss1200.tfm) \
tex(ecss1440.tfm) \
tex(ecss1728.tfm) \
tex(ecss2074.tfm) \
tex(ecss2488.tfm) \
tex(ecss2986.tfm) \
tex(ecss3583.tfm) \
tex(ecst0800.tfm) \
tex(ecst0900.tfm) \
tex(ecst1000.tfm) \
tex(ecst1095.tfm) \
tex(ecst1200.tfm) \
tex(ecst1440.tfm) \
tex(ecst1728.tfm) \
tex(ecst2074.tfm) \
tex(ecst2488.tfm) \
tex(ecst2986.tfm) \
tex(ecst3583.tfm) \
tex(ecsx0500.tfm) \
tex(ecsx0600.tfm) \
tex(ecsx0700.tfm) \
tex(ecsx0800.tfm) \
tex(ecsx0900.tfm) \
tex(ecsx1000.tfm) \
tex(ecsx1095.tfm) \
tex(ecsx1200.tfm) \
tex(ecsx1440.tfm) \
tex(ecsx1728.tfm) \
tex(ecsx2074.tfm) \
tex(ecsx2488.tfm) \
tex(ecsx2986.tfm) \
tex(ecsx3583.tfm) \
tex(ecti0500.tfm) \
tex(ecti0600.tfm) \
tex(ecti0700.tfm) \
tex(ecti0800.tfm) \
tex(ecti0900.tfm) \
tex(ecti1000.tfm) \
tex(ecti1095.tfm) \
tex(ecti1200.tfm) \
tex(ecti1440.tfm) \
tex(ecti1728.tfm) \
tex(ecti2074.tfm) \
tex(ecti2488.tfm) \
tex(ecti2986.tfm) \
tex(ecti3583.tfm) \
tex(ectt0800.tfm) \
tex(ectt0900.tfm) \
tex(ectt1000.tfm) \
tex(ectt1095.tfm) \
tex(ectt1200.tfm) \
tex(ectt1440.tfm) \
tex(ectt1728.tfm) \
tex(ectt2074.tfm) \
tex(ectt2488.tfm) \
tex(ectt2986.tfm) \
tex(ectt3583.tfm) \
tex(ecui0500.tfm) \
tex(ecui0600.tfm) \
tex(ecui0700.tfm) \
tex(ecui0800.tfm) \
tex(ecui0900.tfm) \
tex(ecui1000.tfm) \
tex(ecui1095.tfm) \
tex(ecui1200.tfm) \
tex(ecui1440.tfm) \
tex(ecui1728.tfm) \
tex(ecui2074.tfm) \
tex(ecui2488.tfm) \
tex(ecui2986.tfm) \
tex(ecui3583.tfm) \
tex(ecvi0800.tfm) \
tex(ecvi0900.tfm) \
tex(ecvi1000.tfm) \
tex(ecvi1095.tfm) \
tex(ecvi1200.tfm) \
tex(ecvi1440.tfm) \
tex(ecvi1728.tfm) \
tex(ecvi2074.tfm) \
tex(ecvi2488.tfm) \
tex(ecvi2986.tfm) \
tex(ecvi3583.tfm) \
tex(ecvt0800.tfm) \
tex(ecvt0900.tfm) \
tex(ecvt1000.tfm) \
tex(ecvt1095.tfm) \
tex(ecvt1200.tfm) \
tex(ecvt1440.tfm) \
tex(ecvt1728.tfm) \
tex(ecvt2074.tfm) \
tex(ecvt2488.tfm) \
tex(ecvt2986.tfm) \
tex(ecvt3583.tfm) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(tcbi0500.tfm) \
tex(tcbi0600.tfm) \
tex(tcbi0700.tfm) \
tex(tcbi0800.tfm) \
tex(tcbi0900.tfm) \
tex(tcbi1000.tfm) \
tex(tcbi1095.tfm) \
tex(tcbi1200.tfm) \
tex(tcbi1440.tfm) \
tex(tcbi1728.tfm) \
tex(tcbi2074.tfm) \
tex(tcbi2488.tfm) \
tex(tcbi2986.tfm) \
tex(tcbi3583.tfm) \
tex(tcbl0500.tfm) \
tex(tcbl0600.tfm) \
tex(tcbl0700.tfm) \
tex(tcbl0800.tfm) \
tex(tcbl0900.tfm) \
tex(tcbl1000.tfm) \
tex(tcbl1095.tfm) \
tex(tcbl1200.tfm) \
tex(tcbl1440.tfm) \
tex(tcbl1728.tfm) \
tex(tcbl2074.tfm) \
tex(tcbl2488.tfm) \
tex(tcbl2986.tfm) \
tex(tcbl3583.tfm) \
tex(tcbx0500.tfm) \
tex(tcbx0600.tfm) \
tex(tcbx0700.tfm) \
tex(tcbx0800.tfm) \
tex(tcbx0900.tfm) \
tex(tcbx1000.tfm) \
tex(tcbx1095.tfm) \
tex(tcbx1200.tfm) \
tex(tcbx1440.tfm) \
tex(tcbx1728.tfm) \
tex(tcbx2074.tfm) \
tex(tcbx2488.tfm) \
tex(tcbx2986.tfm) \
tex(tcbx3583.tfm) \
tex(tcit0800.tfm) \
tex(tcit0900.tfm) \
tex(tcit1000.tfm) \
tex(tcit1095.tfm) \
tex(tcit1200.tfm) \
tex(tcit1440.tfm) \
tex(tcit1728.tfm) \
tex(tcit2074.tfm) \
tex(tcit2488.tfm) \
tex(tcit2986.tfm) \
tex(tcit3583.tfm) \
tex(tcrb0500.tfm) \
tex(tcrb0600.tfm) \
tex(tcrb0700.tfm) \
tex(tcrb0800.tfm) \
tex(tcrb0900.tfm) \
tex(tcrb1000.tfm) \
tex(tcrb1095.tfm) \
tex(tcrb1200.tfm) \
tex(tcrb1440.tfm) \
tex(tcrb1728.tfm) \
tex(tcrb2074.tfm) \
tex(tcrb2488.tfm) \
tex(tcrb2986.tfm) \
tex(tcrb3583.tfm) \
tex(tcrm0500.tfm) \
tex(tcrm0600.tfm) \
tex(tcrm0700.tfm) \
tex(tcrm0800.tfm) \
tex(tcrm0900.tfm) \
tex(tcrm1000.tfm) \
tex(tcrm1095.tfm) \
tex(tcrm1200.tfm) \
tex(tcrm1440.tfm) \
tex(tcrm1728.tfm) \
tex(tcrm2074.tfm) \
tex(tcrm2488.tfm) \
tex(tcrm2986.tfm) \
tex(tcrm3583.tfm) \
tex(tcsi0500.tfm) \
tex(tcsi0600.tfm) \
tex(tcsi0700.tfm) \
tex(tcsi0800.tfm) \
tex(tcsi0900.tfm) \
tex(tcsi1000.tfm) \
tex(tcsi1095.tfm) \
tex(tcsi1200.tfm) \
tex(tcsi1440.tfm) \
tex(tcsi1728.tfm) \
tex(tcsi2074.tfm) \
tex(tcsi2488.tfm) \
tex(tcsi2986.tfm) \
tex(tcsi3583.tfm) \
tex(tcsl0500.tfm) \
tex(tcsl0600.tfm) \
tex(tcsl0700.tfm) \
tex(tcsl0800.tfm) \
tex(tcsl0900.tfm) \
tex(tcsl1000.tfm) \
tex(tcsl1095.tfm) \
tex(tcsl1200.tfm) \
tex(tcsl1440.tfm) \
tex(tcsl1728.tfm) \
tex(tcsl2074.tfm) \
tex(tcsl2488.tfm) \
tex(tcsl2986.tfm) \
tex(tcsl3583.tfm) \
tex(tcso0500.tfm) \
tex(tcso0600.tfm) \
tex(tcso0700.tfm) \
tex(tcso0800.tfm) \
tex(tcso0900.tfm) \
tex(tcso1000.tfm) \
tex(tcso1095.tfm) \
tex(tcso1200.tfm) \
tex(tcso1440.tfm) \
tex(tcso1728.tfm) \
tex(tcso2074.tfm) \
tex(tcso2488.tfm) \
tex(tcso2986.tfm) \
tex(tcso3583.tfm) \
tex(tcss0500.tfm) \
tex(tcss0600.tfm) \
tex(tcss0700.tfm) \
tex(tcss0800.tfm) \
tex(tcss0900.tfm) \
tex(tcss1000.tfm) \
tex(tcss1095.tfm) \
tex(tcss1200.tfm) \
tex(tcss1440.tfm) \
tex(tcss1728.tfm) \
tex(tcss2074.tfm) \
tex(tcss2488.tfm) \
tex(tcss2986.tfm) \
tex(tcss3583.tfm) \
tex(tcst0800.tfm) \
tex(tcst0900.tfm) \
tex(tcst1000.tfm) \
tex(tcst1095.tfm) \
tex(tcst1200.tfm) \
tex(tcst1440.tfm) \
tex(tcst1728.tfm) \
tex(tcst2074.tfm) \
tex(tcst2488.tfm) \
tex(tcst2986.tfm) \
tex(tcst3583.tfm) \
tex(tcsx0500.tfm) \
tex(tcsx0600.tfm) \
tex(tcsx0700.tfm) \
tex(tcsx0800.tfm) \
tex(tcsx0900.tfm) \
tex(tcsx1000.tfm) \
tex(tcsx1095.tfm) \
tex(tcsx1200.tfm) \
tex(tcsx1440.tfm) \
tex(tcsx1728.tfm) \
tex(tcsx2074.tfm) \
tex(tcsx2488.tfm) \
tex(tcsx2986.tfm) \
tex(tcsx3583.tfm) \
tex(tcti0500.tfm) \
tex(tcti0600.tfm) \
tex(tcti0700.tfm) \
tex(tcti0800.tfm) \
tex(tcti0900.tfm) \
tex(tcti1000.tfm) \
tex(tcti1095.tfm) \
tex(tcti1200.tfm) \
tex(tcti1440.tfm) \
tex(tcti1728.tfm) \
tex(tcti2074.tfm) \
tex(tcti2488.tfm) \
tex(tcti2986.tfm) \
tex(tcti3583.tfm) \
tex(tctt0800.tfm) \
tex(tctt0900.tfm) \
tex(tctt1000.tfm) \
tex(tctt1095.tfm) \
tex(tctt1200.tfm) \
tex(tctt1440.tfm) \
tex(tctt1728.tfm) \
tex(tctt2074.tfm) \
tex(tctt2488.tfm) \
tex(tctt2986.tfm) \
tex(tctt3583.tfm) \
tex(tcui0500.tfm) \
tex(tcui0600.tfm) \
tex(tcui0700.tfm) \
tex(tcui0800.tfm) \
tex(tcui0900.tfm) \
tex(tcui1000.tfm) \
tex(tcui1095.tfm) \
tex(tcui1200.tfm) \
tex(tcui1440.tfm) \
tex(tcui1728.tfm) \
tex(tcui2074.tfm) \
tex(tcui2488.tfm) \
tex(tcui2986.tfm) \
tex(tcui3583.tfm) \
tex(tcvi0800.tfm) \
tex(tcvi0900.tfm) \
tex(tcvi1000.tfm) \
tex(tcvi1095.tfm) \
tex(tcvi1200.tfm) \
tex(tcvi1440.tfm) \
tex(tcvi1728.tfm) \
tex(tcvi2074.tfm) \
tex(tcvi2488.tfm) \
tex(tcvi2986.tfm) \
tex(tcvi3583.tfm) \
tex(tcvt0800.tfm) \
tex(tcvt0900.tfm) \
tex(tcvt1000.tfm) \
tex(tcvt1095.tfm) \
tex(tcvt1200.tfm) \
tex(tcvt1440.tfm) \
tex(tcvt1728.tfm) \
tex(tcvt2074.tfm) \
tex(tcvt2488.tfm) \
tex(tcvt2986.tfm) \
tex(tcvt3583.tfm) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
