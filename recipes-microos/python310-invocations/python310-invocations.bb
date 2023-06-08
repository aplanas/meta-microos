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

RPM_NAME = "python310-invocations-3.0.0-2.1.noarch.rpm"
RPM_HASH = "62b73175e90b7098100302bc4d5b24c0e291384268c154f6f8ea10b705156de6b33e853c97a6a30e3af8196bcdf53067a2198cc6de9c3dd338b858e59f9b9b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invocations python3.10dist(invocations) python310-invocations python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) python310-blessings python310-invoke python310-lexicon python310-releases python310-semantic_version python310-six python310-tabulate python310-tqdm python310-twine python310-wheel"

inherit rpm
