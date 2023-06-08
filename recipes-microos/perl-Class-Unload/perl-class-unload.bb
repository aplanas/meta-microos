SUMMARY = "Unload a class"
DESCRIPTION = "Unload a class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Class-Unload-0.11-1.23.noarch.rpm"
RPM_HASH = "4cd08ec89fb02ac7a71871e07f65d709db3bc8f6b12852693d30a7aeac6a60e442f4d3a1a76456e8991a6eb8efe761c3ab423f409405e8912e541499ac205270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::Unload) perl-Class-Unload"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Inspector)"

inherit rpm
