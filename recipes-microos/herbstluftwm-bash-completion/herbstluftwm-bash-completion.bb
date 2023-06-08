SUMMARY = "Bash completion for herbstluftwm"
DESCRIPTION = "Bash completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-bash-completion-0.9.5-1.4.noarch.rpm"
RPM_HASH = "0dd1ed4595dbfa72ca610371c95cccabefef265019df8cef27c51d715d9808a84029ebf1678d91f164ef84fce09f9d58e1000867783c4a0adb8dfd8fb9db8e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-bash-completion"
RDEPENDS:${PN} += "bash-completion herbstluftwm"

inherit rpm
