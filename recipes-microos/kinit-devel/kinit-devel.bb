SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kinit-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "baf25ae98fb9fd55de7947b355350282df2478292058ae798ae6a54a1153e22efa095791f14d6f7c227a87858126a63c8c39fbac52d710e9ee9a446bb8c1040a"

RPROVIDES:${PN} += "cmake(KF5Init) kinit-devel kinit-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules"

inherit rpm
