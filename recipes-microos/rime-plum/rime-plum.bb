SUMMARY = "Rime's configuration manager"
DESCRIPTION = "Plum is rime's configuration manager."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-plum-20210525+git.4f7fc2a-1.9.aarch64.rpm"
RPM_HASH = "129b8cfd84297e2e8eaa501fe434b6a15a20d65637071789cf6136fb7286844daa6d7a99343dfa30602227dc72eaa40ce6b02e28557d05937d7b2e0148673029"

RPROVIDES:${PN} += "rime-plum rime-plum(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
