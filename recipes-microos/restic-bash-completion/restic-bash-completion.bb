SUMMARY = "Bash Completion for restic"
DESCRIPTION = "Bash command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-bash-completion-0.15.2-1.1.noarch.rpm"
RPM_HASH = "bcfbce4fe934d68cb1eae4b591a08977e76c6a82dcd5e60fc7dc7020f5ad361bfe63006f118e5d4b4cd2cd08be63fc205474e3d7d03509e7bcc758b87ef4fe7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "restic-bash-completion"
RDEPENDS:${PN} += "restic"

inherit rpm
