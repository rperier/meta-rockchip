# Copyright (C) 2014 NEO-Technologies
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Rockchip bootloader collection"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/neo-technologies/rockchip-bootloader.git"
SRCREV_pn-${PN} = "${AUTOREV}"

S = "${WORKDIR}/git"

LOADER = "RK3188Loader(L)_V2.13.bin"

inherit deploy

do_install() {
    install -d ${DEPLOY_DIR_IMAGE}
    install "${S}/${LOADER}" ${DEPLOY_DIR_IMAGE}/loader.bin
}
