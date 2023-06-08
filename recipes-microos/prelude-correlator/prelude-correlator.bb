SUMMARY = "Real time correlator of events received by Prelude Manager"
DESCRIPTION = "Prelude-Correlator allows conducting multi-stream correlations \
thanks to a powerful programming language for writing correlation \
rules. With any type of alert able to be correlated, event \
analysis becomes simpler, quicker and more incisive. This \
correlation alert then appears within the Prewikka interface \
and indicates the potential target information via the set of \
correlation rules."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-correlator-5.2.0-2.5.noarch.rpm"
RPM_HASH = "ad38c875e5dd9a8b4aa21e80240c23b7c7c2185e67c88bf447761a23391a8d3ff81233d39844a70c9b1ee7e8ab4831981e8faa10b85e3a446942b8940b3dde78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(prelude-correlator) prelude-correlator prelude-correlator-core"
RDEPENDS:${PN} += "/bin/sh python3-prelude-correlator systemd"

inherit rpm
