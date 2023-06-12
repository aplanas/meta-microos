SUMMARY = "Command-line converter of files in formats supported by xylib"
DESCRIPTION = "Command-line converter of files in formats supported by xylib: \
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

RPM_NAME = "xyconv-1.6-1.15.aarch64.rpm"
RPM_HASH = "9ddb2169c6cb257c8f7fc524905522d65a8e8f7dc056a0fbb3767eb62e1a6061f8895dd767303db907f47386ba9ec236ac4106cadf8aa0387ee2cb197e260607"

RPROVIDES:${PN} += "xyconv \
xyconv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxy.so.3()(64bit)"

inherit rpm
