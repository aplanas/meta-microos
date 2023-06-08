SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use zsh as /bin/sh implementation."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-sh-5.9-5.3.noarch.rpm"
RPM_HASH = "32d9ea36ba0ab2a3399d27c1e221798e6f647a8308311d850b237c5499a333d3949279b7056789bf53839ad7ae820db47473ac395cf329c67265576272a722cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/sh alternative(sh) zsh-sh"
RDEPENDS:${PN} += "zsh"

inherit rpm
