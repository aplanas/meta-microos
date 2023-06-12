SUMMARY = "PPD Files from Printer Manufacturers"
DESCRIPTION = "PPD files from printer manufacturers that are under a free license. \
 \
For example, the original MIT license, shown for example under \
http://www.opensource.org/licenses/mit-license.php, is okay but not an \
often used modified MIT license, which does not allow redistribution if \
the file was altered in any way from its original form. \
 \
If you have a PostScript printer and there is no PPD file included in \
this package, ask your printer manufacturer for a PPD file or visit \
http://www.linuxprinting.org/ppd-doc.html."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "10.2"

RPM_NAME = "manufacturer-PPDs-10.2-277.2.noarch.rpm"
RPM_HASH = "98fe24f2017997a2fce0c616a0836eb2ab17f604ec0bedb6a37d82f51c10f4480e64295789ecd2d4d8ce9d98543084135def2a2edb19dc505fed7750814e2f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "manufacturer-PPDs \
postscriptdriver(hp;hp2250;) \
postscriptdriver(hp;hp2280;) \
postscriptdriver(hp;hp2300;) \
postscriptdriver(hp;hp2600;) \
postscriptdriver(hp;hp3000;) \
postscriptdriver(hp;hp9100;) \
postscriptdriver(kyocera;cs-1815;) \
postscriptdriver(kyocera;fs-8000c;) \
postscriptdriver(kyocera;fs-9100dn;) \
postscriptdriver(kyocera;fs-9500dn;) \
postscriptdriver(kyocera;fs-c5016n;) \
postscriptdriver(kyocera;fs-c8008n;) \
postscriptdriver(kyocera;km-1815;) \
postscriptdriver(kyocera;kyocera_fs-1000;) \
postscriptdriver(kyocera;kyocera_fs-1030d;) \
postscriptdriver(kyocera;kyocera_fs-1200;) \
postscriptdriver(kyocera;kyocera_fs-1700+;) \
postscriptdriver(kyocera;kyocera_fs-1700;) \
postscriptdriver(kyocera;kyocera_fs-1714m;) \
postscriptdriver(kyocera;kyocera_fs-1750;) \
postscriptdriver(kyocera;kyocera_fs-2000d;) \
postscriptdriver(kyocera;kyocera_fs-3700+;) \
postscriptdriver(kyocera;kyocera_fs-3700;) \
postscriptdriver(kyocera;kyocera_fs-3718m;) \
postscriptdriver(kyocera;kyocera_fs-3750;) \
postscriptdriver(kyocera;kyocera_fs-3900dn;) \
postscriptdriver(kyocera;kyocera_fs-4000dn;) \
postscriptdriver(kyocera;kyocera_fs-5800c;) \
postscriptdriver(kyocera;kyocera_fs-5900c;) \
postscriptdriver(kyocera;kyocera_fs-600;) \
postscriptdriver(kyocera;kyocera_fs-6300;) \
postscriptdriver(kyocera;kyocera_fs-6500+;) \
postscriptdriver(kyocera;kyocera_fs-6700;) \
postscriptdriver(kyocera;kyocera_fs-680;) \
postscriptdriver(kyocera;kyocera_fs-6900;) \
postscriptdriver(kyocera;kyocera_fs-6950dn;) \
postscriptdriver(kyocera;kyocera_fs-7000+;) \
postscriptdriver(kyocera;kyocera_fs-7000;) \
postscriptdriver(kyocera;kyocera_fs-7028m;) \
postscriptdriver(kyocera;kyocera_fs-800;) \
postscriptdriver(kyocera;kyocera_fs-9000;) \
postscriptdriver(kyocera;kyocera_fs-9130dn;) \
postscriptdriver(kyocera;kyocera_fs-920;) \
postscriptdriver(kyocera;kyocera_fs-9530dn;) \
postscriptdriver(kyocera;kyocera_fs-c5020n;) \
postscriptdriver(kyocera;kyocera_fs-c5030n;) \
postscriptdriver(kyocera;kyocera_km-6030;) \
postscriptdriver(kyocera;kyocera_km-8030;) \
postscriptdriver(kyocera;kyocera_km-c2520;) \
postscriptdriver(kyocera;kyocera_km-c3225;) \
postscriptdriver(kyocera;kyocera_km-c3232;) \
postscriptdriver(kyocera_mita;km-1510;) \
postscriptdriver(kyocera_mita;km-1530;) \
postscriptdriver(kyocera_mita;km-1810;) \
postscriptdriver(kyocera_mita;km-2030;) \
postscriptdriver(kyocera_mita;km-4230/5230;) \
postscriptdriver(kyocera_mita;km-6230;) \
postscriptdriver(kyocera_mita;km-c2630;) \
postscriptdriver(kyocera_mita;km-c830;) \
postscriptdriver(kyocera_mita;km-c850;) \
postscriptdriver(kyocera_mita;kyocera_mita_ci-1100;) \
postscriptdriver(kyocera_mita;kyocera_mita_cs-1815;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1000+;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1010;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1018mfp;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1020d;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1050;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1800+;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1800;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1900;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-1920;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-3800;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-3820n;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-3830n;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-6020;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-6026;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-6750;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-8000c;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-9100dn;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-9500dn;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-c5016n;) \
postscriptdriver(kyocera_mita;kyocera_mita_fs-c8008n;) \
postscriptdriver(kyocera_mita;kyocera_mita_km-1815;) \
postscriptdriver(oki_data_corp;microline905psiii+f;) \
postscriptdriver(oki_data_corp;ml703n3;)"
RDEPENDS:${PN} += ""

inherit rpm
