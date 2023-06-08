SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683277334.0688448"

RPM_NAME = "os-autoinst-swtpm-4.6.1683277334.0688448-1.1.aarch64.rpm"
RPM_HASH = "ef9ee79ccdf2f10972942d651cb6080097e744c26bfdd0d10f58721e89b6dfcdefb2c439a7537187f0c55fa741b9fc13db57e7079ad952dbd1783bcd36517437"

RPROVIDES:${PN} += "os-autoinst-swtpm os-autoinst-swtpm(aarch-64)"
RDEPENDS:${PN} += "os-autoinst swtpm"

inherit rpm
