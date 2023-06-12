SUMMARY = "Modular source code checker: pep8, pyflakes and co"
DESCRIPTION = "Flake8 is a modular extensible source code checker including wrappers \
around these tools: \
 \
- PyFlakes \
- pep8 \
- Ned Batchelder's McCabe script \
 \
Flake8 runs all the tools by launching the single ``flake8`` script."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-flake8-6.0.0-2.1.noarch.rpm"
RPM_HASH = "ed19eeb33595d4725798671bb855a224ce8ba951960758833695a2861761c6eb016f4578de1589ddf430885c7854a1747d9121fcd9a0397444f5850f93c04756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8) \
python39-flake8 \
python3dist(flake8)"
RDEPENDS:${PN} += "(python39-mccabe >= 0.7.0 with python39-mccabe < 0.8.0) \
(python39-pycodestyle >= 2.10.0 with python39-pycodestyle < 2.11.0) \
(python39-pyflakes >= 3.0.0 with python39-pyflakes < 3.1.0) \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
