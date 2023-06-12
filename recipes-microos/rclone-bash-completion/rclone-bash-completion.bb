SUMMARY = "Bash Completion for rclone"
DESCRIPTION = "Bash command line completion support for rclone."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-bash-completion-1.62.2-2.2.noarch.rpm"
RPM_HASH = "4772b8904debb08ef68fa49c39658305fe16269db244475878cda9605571f9aa05c759b185c42dfb14b9fa25351df37e9eccdd5532f094a237684993b478ce18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rclone-bash-completion"
RDEPENDS:${PN} += "rclone"

inherit rpm
