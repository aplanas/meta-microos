SUMMARY = "Lunar calendar Documents"
DESCRIPTION = "Documents for lunar-calendar"
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "lunar-calendar-doc-3.0.0+git20191124.f91a880-1.15.noarch.rpm"
RPM_HASH = "689c66b80b6886f81de41c2539749cd2ecd266e1f1e7570577fc13e1cb2dbf847aa2ab9facd3bbd327882f6bac919222dca091daaf56c9265f0797daf838c9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lunar-calendar-doc"
RDEPENDS:${PN} += "lunar-calendar"

inherit rpm
