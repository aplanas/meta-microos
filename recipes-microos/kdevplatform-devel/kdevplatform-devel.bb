SUMMARY = "Base Package for Integrated Development Environments: Build Environment"
DESCRIPTION = "This package contains the development files for building integrated \
developments environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdevplatform-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f7e2028133eac8280e28f54a25e56145d87b7215b2424ecd42012a2ba6fda717ca77946bc18256d9b582ae74e80654844a44bde16802edf8631952c4359a872b"

RPROVIDES:${PN} += "cmake(KDevPlatform) kdevplatform-devel kdevplatform-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5TextEditor) cmake(KF5ThreadWeaver) libkdevplatform511"

inherit rpm
