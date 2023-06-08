SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-doc-253.4-1.2.aarch64.rpm"
RPM_HASH = "a43abd4a0e735ed1c734b3ac595f7db627d00eb7b55d610261d059988ec979248ad7292d476b3dfc6688309b380811143e7f5e41b90b22147115d057d030b534"

RPROVIDES:${PN} += "systemd-doc systemd-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
