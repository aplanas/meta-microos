SUMMARY = "B::COW additional B helpers to check COW status"
DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-B-COW-0.007-1.2.aarch64.rpm"
RPM_HASH = "0af3a1cc7f2fe97e4f25cabdf0b905341ae683d6b1fe3302ccbb0afff1c5dcdfb2e3711eff7697fdaf5b2f9ff4fb5996987d30b4ce5cf368f016e141c3a8593c"

RPROVIDES:${PN} += "perl(B::COW) perl-B-COW perl-B-COW(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
