SUMMARY = "GUI converter of files in formats supported by xylib"
DESCRIPTION = "GUI converter of files in formats supported by xylib: \
- plain text, delimiter-separated values (e.g. CSV) \
- Crystallographic Information File for Powder Diffraction (pdCIF) \
- Siemens/Bruker UXD \
- Siemens/Bruker RAW ver. 1/2/3 \
- Philips UDF \
- Philips RD (raw scan) V3 \
- Rigaku DAT \
- Sietronics Sieray CPI \
- DBWS/DMPLOT data file \
- Canberra CNF (from Genie-2000 software; aka CAM format) \
- Canberra AccuSpec MCA \
- XFIT/Koalariet XDD \
- RIET7/LHPM/CSRIET/ILL\\_D1A5/PSI\\_DMC DAT \
- Vamas ISO14976 \
  *(only experiment modes: SEM or MAPSV or MAPSVDP are supported; \
  only REGULAR scan_mode is supported)* \
- Princeton Instruments WinSpec SPE \
  *(only 1-D data is supported)* \
- χPLOT CHI_ \
- Ron Unwin's Spectra XPS format (VGX-900 compatible)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xyconvert-1.6-1.15.aarch64.rpm"
RPM_HASH = "1fbcf09aa0c424026ecf9f0ab105fd639a30a5065c06c50850b1cff83645260e0c9dad70b783fe7e4cc272eefa4487bfc707b9831632956d23ef1e0b58e3af64"

RPROVIDES:${PN} += "xyconvert \
xyconvert(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libxy.so.3()(64bit)"

inherit rpm
