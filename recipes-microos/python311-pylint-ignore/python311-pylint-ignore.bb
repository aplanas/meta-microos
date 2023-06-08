SUMMARY = "Start with silence, not with noise But do start!"
DESCRIPTION = "Start with silence, not with noise. But do start! \
 \
Pylint-ignore is a wrapper around Pylint that maintains a pylint-ignore.md file. \
This file is used to ignore Pylint messages without adding comments to the \
source code itself. It's similar to Rupocop's .rubocop_todo.yml."
LICENSE = "MIT"

PV = "2022.1025"

RPM_NAME = "python311-pylint-ignore-2022.1025-3.1.noarch.rpm"
RPM_HASH = "56bea3567b516e0ac2c1375fc04c5a5fbda621716a8bb9f93c84fb6ba5b39b802552d11ae01ea0b90184a4b503c6cd3eca83c84aebae748f1a7a24aa0158111e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylint-ignore) python311-pylint-ignore python3dist(pylint-ignore)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-astroid python311-pylev python311-pylint update-alternatives"

inherit rpm
