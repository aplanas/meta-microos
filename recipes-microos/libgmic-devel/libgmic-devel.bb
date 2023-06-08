SUMMARY = "Header and library from gmic for use in other C++ projects"
DESCRIPTION = "Header and library from gmic to needed to develop C++ code that \
uses the gmic functionality provided by the gmic library."
LICENSE = "CECILL-2.1"

PV = "3.2.3"

RPM_NAME = "libgmic-devel-3.2.3-2.1.aarch64.rpm"
RPM_HASH = "296275cc55c1d1deacf31bed9105c3034538a6a45bd1beed4f488d8cf38623166420f6143afe21bc33eae6706a50a02ab9ee05cebfc81e623ddfd0ce2984c17c"

RPROVIDES:${PN} += "libgmic-devel libgmic-devel(aarch-64)"
RDEPENDS:${PN} += "libgmic3"

inherit rpm
