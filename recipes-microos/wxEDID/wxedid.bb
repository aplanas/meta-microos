SUMMARY = "Extended Display Identification Data editor"
DESCRIPTION = "wxEDID is a wxWidgets - based EDID (Extended Display Identification Data) editor. \
This is an early stage of development, allowing to modify the base EDID v1.3+ \
structure and CEA-861 (as first extension block). \
Besides normal editor functionality, the app has been equipped with a DTD \
constructor, which aims to ease timings selection/editing. It's also possible to \
export and import EDID data to/from text files (hex ASCII format) and also to \
save the structures as a human-readable text."
LICENSE = "GPL-3.0-only"

PV = "0.0.29"

RPM_NAME = "wxEDID-0.0.29-1.1.aarch64.rpm"
RPM_HASH = "522f55c6df75da11f4017f851d153340107aaacdcc45e4f514cdf290fd183728e89ef189e10fa6082061f94fb06d269d736fb21d945d5ec5836eeddceef04e19"

RPROVIDES:${PN} += "wxEDID \
wxEDID(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
