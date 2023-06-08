SUMMARY = "Documentation for qt6-quicktimeline in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quicktimeline-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6431ea0778d9f8305f44691f02b89113e6f443623d1885392d5591dda26f460bd0fbc7181cc84560dc28b2113582f0aecdc9fb316dd45fdba3db1814a109fb89"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-html qt6-quicktimeline-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
