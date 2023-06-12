SUMMARY = "Setuptools revision control system plugin for Git"
DESCRIPTION = "This is a plugin for setuptools that enables git integration. Once \
installed, Setuptools can be told to include in a package distribution \
all the files tracked by git. This is an alternative to explicit \
inclusion specifications with MANIFEST.in. \
 \
This package was formerly known as gitlsfiles. The name change is the \
result of an effort by the setuptools plugin developers to provide a \
uniform naming convention."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python39-setuptools-git-1.2-4.1.noarch.rpm"
RPM_HASH = "e83befa8465ccd9ba819a57efedcb70f10193f47c54c76570437c5f4a2a89bc1057538cc142b626ba87f828faa93ef7ea5424f43104b993ed7900cb4d327072e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-git) \
python39-setuptools-git \
python3dist(setuptools-git)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
