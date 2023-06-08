SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2023.20230311.svn28038-89.1.aarch64.rpm"
RPM_HASH = "97ca7ea5b7bf253b94b6a54b899995c36d2e8439190f1eef8a4a66ff2a8b95a727af8fcd5c77487f42270e34779a849fd4a28407f8fe85b01e9afb4128c4d011"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin texlive-adhocfilelist-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
