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

PV = "3.0.2"

RPM_NAME = "python310-invocations-3.0.2-1.1.noarch.rpm"
RPM_HASH = "c9d5d7eb204c2e000c4945eca8ad4e3f4f7e28191d91f3e29fd019055d5b4dbbf56cba0a3388e43efdb350a1e4d0771a2809f74f7b0cd4d16f8ab17c333c5b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-invocations \
python3.10dist(invocations) \
python310-invocations \
python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) \
python310-blessings \
python310-invoke \
python310-lexicon \
python310-releases \
python310-semantic_version \
python310-six \
python310-tabulate \
python310-tqdm \
python310-twine \
python310-wheel"

inherit rpm
