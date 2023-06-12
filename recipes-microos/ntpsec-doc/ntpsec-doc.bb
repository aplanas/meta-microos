SUMMARY = "Documentation for ntpsec"
DESCRIPTION = "Documentation files generated from asciidoc for ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-doc-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "1dfca9d7f13ed9c13bc0ff30538178391e72405c14a05f57a488a4841aeb8c3465f9d7ec9df752bb177a2ee5c8d2599039eca9571731fc1dfadab8a57f7c1fbd"

RPROVIDES:${PN} += "ntpsec-doc \
ntpsec-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
