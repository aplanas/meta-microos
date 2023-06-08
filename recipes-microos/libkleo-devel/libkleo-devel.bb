SUMMARY = "Development package for libkleo"
DESCRIPTION = "The development package for the libkleo libraries."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkleo-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4213662ccf73190c7743a3acf68bd66e2393f684b4331ffc6ed4bd01394654b1eba3148cf2fee332c2e3dfad3c4e58e37f233de18361f21e68b4215de67267ab"

RPROVIDES:${PN} += "cmake(KF5Libkleo) cmake(KPim5Libkleo) libkleo-devel libkleo-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(QGpgme) libKPim5libkleo5 libgpgmepp-devel"

inherit rpm
