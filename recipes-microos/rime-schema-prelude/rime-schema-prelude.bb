SUMMARY = "prelude input schema for rime"
DESCRIPTION = "preludeinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-prelude-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "fa34a97f16d56ea268d7208c9634cd9bfcf59842f826229c937fffe8dd083311dab24908cfe625ad00c99d91049456f28a635124ffddc3e6895a8377a2540f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-prelude"
RDEPENDS:${PN} += ""

inherit rpm
