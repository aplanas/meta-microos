SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python39-pyperclip-1.8.2-2.1.noarch.rpm"
RPM_HASH = "5c620e8be6fc7d2f4d543145c2db289e75e183fb981f8cce6ca6285120110227e1db84e5ffa1ea51f3b4c02702f73e97726f9cfd637ee3866d8d06037af87456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyperclip) python39-pyperclip python3dist(pyperclip)"
RDEPENDS:${PN} += "python(abi) xclip xsel"

inherit rpm
