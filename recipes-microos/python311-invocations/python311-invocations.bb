SUMMARY = "Reusable Invoke tasks"
DESCRIPTION = "Invocations is a collection of reusable `Invoke <http://pyinvoke.org>`_ \
tasks/task modules, including (but not limited to) Python project management \
tools such as documentation building and dependency organization. \
 \
It has no stand-alone components and is designed to be imported into your \
pre-existing Invoke task files. \
 \
Invocations is currently in pre-alpha status and is unsupported. Please follow \
the Invoke project's communication channels for updates. Thanks!"
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python311-invocations-3.0.0-2.1.noarch.rpm"
RPM_HASH = "02ded5ba6b34d606e1428523751c3896cb4be11210904ba5f82dc329740b9e10c6353a04ef866855f3e165d1f4aa7138648b96ae106674c073ccab9d21531b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(invocations) python311-invocations python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) python311-blessings python311-invoke python311-lexicon python311-releases python311-semantic_version python311-six python311-tabulate python311-tqdm python311-twine python311-wheel"

inherit rpm
