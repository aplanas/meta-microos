SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53444"

RPM_NAME = "texlive-texplate-bin-2023.20230311.svn53444-89.1.aarch64.rpm"
RPM_HASH = "f8eb18b0cffa9b75d19d3fd1a57f913c0b7c8fffb07d90be22c9689dbe24ff7cd56df208b10366911142e5a5e8d7ece37958e4bffc21035c7f423e39cb9e90d0"

RPROVIDES:${PN} += "texlive-texplate-bin texlive-texplate-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texplate"

inherit rpm
