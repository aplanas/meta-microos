SUMMARY = "Python packages that adds features to Click"
DESCRIPTION = "Adds features to Click: option groups, constraints, subcommand sections and help themes."
LICENSE = "BSD-3-Clause"

PV = "2.0.0.post1"

RPM_NAME = "python39-cloup-2.0.0.post1-1.3.noarch.rpm"
RPM_HASH = "efe5fa65df330939ba123a1c850312d7d222c3b6de437c5c0c38d0d610d810529b6a4937e21043f8ec5034c68aaea5f305ef659dd9043bb5ed3a8f74945fec86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cloup) python39-cloup python3dist(cloup)"
RDEPENDS:${PN} += "python(abi) python39-click"

inherit rpm
