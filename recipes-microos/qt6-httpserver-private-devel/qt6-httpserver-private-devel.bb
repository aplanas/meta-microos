SUMMARY = "Non-ABI stable API for the Qt 6 HttpServer Library"
DESCRIPTION = "This package provides private headers of libQt6HttpServer that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-httpserver-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "aa0eb8c123f3dd63aba87a132b5f04be1b903273e02fda27ca1869fce37a3fa89f762a0518236ef31f644541bfc5adea964e1b498d3641777f7ef2769bd56e04"

RPROVIDES:${PN} += "qt6-httpserver-private-devel qt6-httpserver-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6HttpServer)"

inherit rpm
