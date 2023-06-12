SUMMARY = "An expressive monospaced font family"
DESCRIPTION = "Intel One Mono is an expressive monospaced font family. \
 \
Identifying the typographically underserved low-vision developer \
audience, Frere-Jones Type designed the Intel One Mono typeface in \
partnership with the Intel Brand Team and VMLY&R, for maximum \
legibility to address developers' fatigue and eyestrain and reduce \
coding errors. A panel of low-vision and legally blind developers \
provided feedback at each stage of design."
LICENSE = "OFL-1.1"

PV = "1.2.0"

RPM_NAME = "intel-one-mono-fonts-1.2.0-1.1.noarch.rpm"
RPM_HASH = "ab5575a5a72006300574d12cc836ce5bb850ccfad4d9637cf73cb57d7743d9e142e15aec9add0c60142faa4cdb5f73374bb06091937e9894fc1ec719eaff3346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intel-one-mono-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
