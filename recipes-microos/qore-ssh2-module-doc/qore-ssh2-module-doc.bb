SUMMARY = "Documentation and examples for the Qore SSH2 module"
DESCRIPTION = "SSH2 module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-ssh2-module-doc-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "7f1a0aaa5a8d619576af70aaf0168e81c1a571740c587a5e3aab796738b165d3a588ed5f276c100b25c3c496854782c07583f96370ec921757c77f48161b3a2f"

RPROVIDES:${PN} += "qore-ssh2-module-doc qore-ssh2-module-doc(aarch-64)"
RDEPENDS:${PN} += "qore-ssh2-module"

inherit rpm
