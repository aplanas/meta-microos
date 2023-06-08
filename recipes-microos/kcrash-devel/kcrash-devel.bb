SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcrash-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "89d5654088190ebe91626379a8fb4f76d5021401019ae24bdc99fc43cfafb7c9eb7f822d95c98f0c53c670729ce3025e73e00f38d03e68a3da397f378f829814"

RPROVIDES:${PN} += "cmake(KF5Crash) kcrash-devel kcrash-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5Crash5"

inherit rpm
