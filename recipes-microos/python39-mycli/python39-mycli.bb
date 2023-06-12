SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python39-mycli-1.26.1-2.5.noarch.rpm"
RPM_HASH = "9d720e281b3d85a0d5e1575921897b0e258df9acc4494559f322e747608c686b73acb7cdee15439f740ddc85e82322738cef80f68815bb8e39e94cff32eaf675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mycli) \
python39-mycli \
python3dist(mycli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyMySQL \
python39-Pygments \
python39-cli-helpers \
python39-click \
python39-configobj \
python39-cryptography \
python39-prompt_toolkit \
python39-pyaes \
python39-pyperclip \
python39-sqlglot \
python39-sqlparse \
update-alternatives"

inherit rpm
