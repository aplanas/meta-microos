SUMMARY = "Check if your Manifest matches your distro"
DESCRIPTION = "Check if your Manifest matches your distro"
LICENSE = "Artistic-2.0"

PV = "1.43"

RPM_NAME = "perl-Test-CheckManifest-1.43-1.1.noarch.rpm"
RPM_HASH = "99023bced5c91c54973a7b94674798c4478edbd734e3fdbe86eb16607dea46077bd41ac36daaaf6df1b7b4c5de59babb81e331bd60d02569f8310f3864386941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::CheckManifest) perl-Test-CheckManifest"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Cwd)"

inherit rpm
