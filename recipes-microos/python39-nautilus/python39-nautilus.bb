SUMMARY = "Python bindings for Nautilus"
DESCRIPTION = "This package contains bindings to write Nautilus extensions with Python. \
It allows writing menu, property pages and column providers extensions, \
so that Nautilus functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python39-nautilus-4.0-1.5.aarch64.rpm"
RPM_HASH = "5cc73c35899afb0a97abd46f4d7d5e687cb75f9dc7e4a9cba86262aa7b55798d3e2bf16386502dd78eeca9730d2285655b5662c5c757dd6e6b9268ef81f66cbb"

RPROVIDES:${PN} += "python39-nautilus python39-nautilus(aarch-64)"
RDEPENDS:${PN} += "python39-gobject python39-nautilus-common-files typelib(Nautilus)"

inherit rpm
