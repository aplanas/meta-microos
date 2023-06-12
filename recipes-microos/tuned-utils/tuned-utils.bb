SUMMARY = "Disk and net statistic monitoring systemtap scripts"
DESCRIPTION = "This package contains utilities that can help you to fine tune your \
system and manage tuned profiles."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-utils-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "a3ffd6e329a82c4c6aa4828074584d6cfc678236b6765bd559c59b5b9e192f438fae09314de2453495085fbc7c9d48c3dd6cb23b0ab72cd3f1808bf631ab6d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-utils"
RDEPENDS:${PN} += "/usr/bin/python3 \
powertop \
tuned"

inherit rpm
