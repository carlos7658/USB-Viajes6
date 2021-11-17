package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.TipoIdentificacion;
import co.edu.usbcali.viajesusb.dto.TipoIdentificacionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T12:17:36-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Eclipse Adoptium)"
)
@Component
public class TipoIdentificacionMapperImpl implements TipoIdentificacionMapper {

    @Override
    public TipoIdentificacionDTO tipoIdentificacionToTipoIdentificacionDTO(TipoIdentificacion tipoDestino) {
        if ( tipoDestino == null ) {
            return null;
        }

        TipoIdentificacionDTO tipoIdentificacionDTO = new TipoIdentificacionDTO();

        tipoIdentificacionDTO.setCodigo( tipoDestino.getCodigo() );
        tipoIdentificacionDTO.setEstado( tipoDestino.getEstado() );
        tipoIdentificacionDTO.setFechaCreacion( tipoDestino.getFechaCreacion() );
        tipoIdentificacionDTO.setFechaModificacion( tipoDestino.getFechaModificacion() );
        tipoIdentificacionDTO.setIdTiId( tipoDestino.getIdTiId() );
        tipoIdentificacionDTO.setNombre( tipoDestino.getNombre() );
        tipoIdentificacionDTO.setUsuCreador( tipoDestino.getUsuCreador() );
        tipoIdentificacionDTO.setUsuModificador( tipoDestino.getUsuModificador() );

        return tipoIdentificacionDTO;
    }

    @Override
    public TipoIdentificacion tipoIdentificacionDTOToTipoIdentificacion(TipoIdentificacionDTO tipoDestinoDTO) {
        if ( tipoDestinoDTO == null ) {
            return null;
        }

        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setCodigo( tipoDestinoDTO.getCodigo() );
        tipoIdentificacion.setEstado( tipoDestinoDTO.getEstado() );
        tipoIdentificacion.setFechaCreacion( tipoDestinoDTO.getFechaCreacion() );
        tipoIdentificacion.setFechaModificacion( tipoDestinoDTO.getFechaModificacion() );
        tipoIdentificacion.setIdTiId( tipoDestinoDTO.getIdTiId() );
        tipoIdentificacion.setNombre( tipoDestinoDTO.getNombre() );
        tipoIdentificacion.setUsuCreador( tipoDestinoDTO.getUsuCreador() );
        tipoIdentificacion.setUsuModificador( tipoDestinoDTO.getUsuModificador() );

        return tipoIdentificacion;
    }

    @Override
    public List<TipoIdentificacionDTO> listTipoIdentificacionToListTipoIdentificacionDTO(List<TipoIdentificacion> lsttipoDestino) {
        if ( lsttipoDestino == null ) {
            return null;
        }

        List<TipoIdentificacionDTO> list = new ArrayList<TipoIdentificacionDTO>( lsttipoDestino.size() );
        for ( TipoIdentificacion tipoIdentificacion : lsttipoDestino ) {
            list.add( tipoIdentificacionToTipoIdentificacionDTO( tipoIdentificacion ) );
        }

        return list;
    }

    @Override
    public List<TipoIdentificacionDTO> listTipoIdentificacionDTOToListTipoIdentificacion(List<TipoIdentificacion> lsttipoDestino) {
        if ( lsttipoDestino == null ) {
            return null;
        }

        List<TipoIdentificacionDTO> list = new ArrayList<TipoIdentificacionDTO>( lsttipoDestino.size() );
        for ( TipoIdentificacion tipoIdentificacion : lsttipoDestino ) {
            list.add( tipoIdentificacionToTipoIdentificacionDTO( tipoIdentificacion ) );
        }

        return list;
    }
}
