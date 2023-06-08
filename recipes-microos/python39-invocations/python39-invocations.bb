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

RPM_NAME = "python39-invocations-3.0.0-2.1.noarch.rpm"
RPM_HASH = "073cc01ba86243b24f93600e0585d20908f56b0d7239f6f48e6df3b6926aa2aae7a968e8c7a33ce8bb875adb81db59b30f49e802322413e48cf63f8413de75b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(invocations) python39-invocations python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) python39-blessings python39-invoke python39-lexicon python39-releases python39-semantic_version python39-six python39-tabulate python39-tqdm python39-twine python39-wheel"

inherit rpm
