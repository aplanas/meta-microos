SUMMARY = "Acceptance tests for Future::IO implementations"
DESCRIPTION = "This module contains a collection of acceptance tests for implementations \
of Future::IO."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Test-Future-IO-Impl-0.14-1.1.noarch.rpm"
RPM_HASH = "a7f097d647eb35c2e5227519d40a921271a1c2ad50ad0dab6f6b435de1abaa4ec36d274592f4ff5ef439aab5ba9e4429389fa32121c417fb4724a67d7884fd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Future::IO::Impl) perl-Test-Future-IO-Impl"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test2::V0)"

inherit rpm
