SUMMARY = "Pretty printer for pytest progress"
DESCRIPTION = "pytest-sugar is a plugin for py.test that shows failures and errors instantly and shows a progress bar."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "python311-pytest-sugar-0.9.7-1.1.noarch.rpm"
RPM_HASH = "6661131eaaa25c93f3f7d9ea81ca07a8035e5c2927b9a5dcee15b8d9b7e51287965a0230adc0656f956de39ea68b311f13968ea7c899acc1086a9a64cd61394c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-sugar) \
python311-pytest-sugar \
python3dist(pytest-sugar)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest \
python311-termcolor"

inherit rpm
