SUMMARY = "Git remote helper for repositories stored on Keybase"
DESCRIPTION = " \
A git remote helper that allows storing Git repositories using Keybase. \
Repositories can be completely private or bound to a team. \
Repositories using this remote helper use the scheme keybase://."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-git-6.0.2-3.3.aarch64.rpm"
RPM_HASH = "cba116d03e81164cdf2579b9fc58b134a7bccb4f4b05683ac76ee7785b220b36eaea251038879500ffbae08ef4b5423ed7fe5b98b0b250129513c960b01dbd85"

RPROVIDES:${PN} += "kbfs-git kbfs-git(aarch-64)"
RDEPENDS:${PN} += "kbfs keybase-client"

inherit rpm
