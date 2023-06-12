SUMMARY = "Facility for creating read-only scalars, arrays, and hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, and hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Const-Fast-0.014-1.25.noarch.rpm"
RPM_HASH = "3fe2eceaeed9057ca241801ffd1475ec762d97bb75f00654877a460cc066f61269ba95ab00e2c542ea10de6188db0970211c93d593ef310cb607db18b27e9cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Const::Fast) \
perl-Const-Fast"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Sub::Exporter::Progressive)"

inherit rpm
