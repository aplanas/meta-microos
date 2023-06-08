SUMMARY = "Dotfile synchronizer based on Git and Bash"
DESCRIPTION = "Homeshick is a tool for users to manage configuration files, also known as \
dotfiles. It leverages Git repositories to store and version dotfiles, and to \
synchronize dotfile repositories between accounts and/or machines. \
 \
For example, this allows managing personal dotfiles alongside emacs or vim \
plugins without clutter. It also makes it easy to install large external \
frameworks, such as oh-my-zsh, found on sites like https://dotfiles.github.io/."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "homeshick-2.0.0-3.2.noarch.rpm"
RPM_HASH = "0e9e5f10096a9a889bd4abe286132ff3f3c46bad00726fedda7b1dbdf38f5f0f016dd4063088db1b2895fc90a56259a24a4f06a77f105381a5cf216a1702ec7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homeshick"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env bash git"

inherit rpm
